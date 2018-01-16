/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function scientificAPI(elementId,api,keys){
    var key = keys;
    
    
    var q =new Vue({
        el:'#'+elementId,
        data:{
            url: "/api/scientific/",
            data:{},
            databack: {},
            id:'1',
            mean:'编辑'
            
        },
        methods:{
            get:function(){
                var a  = this.url +'get'+api;
                this.$http.get(a, {params: {id:1}}).then(function (response) {
                    this.data = $.parseJSON(response.bodyText);
                },function (e) {alert('');});
            },
            back:function(){
            
                      for( var q =0;q<key.length ; q++ ){
            var date = new Date(document.getElementById(key[q]).value);//可以传时间，也可以不传，不传的话就是默认的当前时间  
            
            var time3 = Date.parse(date);  
            this.data[ key[q] ] = time3;
        }
                
                var a  = this.url +'update'+api;
                this.databack = this.data;
                for (var i in this.databack) {
                    if (this.databack[i] === null) {
                        delete this.databack[i];
                    }
                }
                this.$http.get(a, {params: this.databack}).then(function (response) {
                    ProfessionalDuties();
                    alert("修改成功");
                },function (e) {alert('');});
            },
            add:function(id){
                var a  = this.url +'add'+api;
                var s = this.data;
                s.id = id;
                for (var i in s) {
                    if (s[i] === null) {
                        delete s[i];
                    }
                }
                this.$http.get(a, {params: s}).then(function (response) {
                    alert("添加成功");
                },function (e) {alert('');});
            }
        }
        
    });
    
   
    
}

//艺术方面的科研成果
function Art(){
    var f = changeinnerHtml("Art");
    f.common("文艺作品类别*", "type");
  //  f.time("是否具有代表性", "isRepresentativeness");
    f.common("作品名称 o", "artName");
    f.common("本人角色 o", "selfRole");
    f.time("完成时间 o", "completeTime");var yui =['completeTime'];
    f.common("完成地点 o", "completePlace");
    f.common("工作描述 o", "jobDescription");
var options = ['是','否'];
    f.select(options,"是否具有代表性o",'isRepresentativeness');

    f.start2();
    scientificAPI('Art', '-art-by-id');

    function runother() {
        f.start();
        scientificAPI('Art', '-art-by-id',yui);
    }
    $('#bianji').click(runother);
}

//科研成果的奖励部分
function Award(){
    var f = changeinnerHtml("Award");
    f.common("奖励类别", "type");
   // f.common("是否为代表性成果 o", "isRepresentativeness");
    f.time("获奖日期 o", "dateOfAward");var yui =['dateOfAward'];
    f.common("文艺作品类别 o", "awardName");
   // f.common("奖励等级 o", "awardLevel");
    f.common("其他等级 o", "otherLevel");
    f.common("本人排名 o", "selfRank");
    f.common("授奖国家 o", "stateOfPrizes");
    f.common("授奖单位 o", "unitOfPrizes");
    
var options = ['是','否'];
    f.select(options,"是否为代表性成果 o",'isRepresentativeness');
var options = ['1-特等','2-一等','3-二等','4-三等','5-四等','6-未评等级','9-其他'];
    f.select(options,"奖励等级 o",'awardLevel');

    f.start2();
    scientificAPI('Award', '-award-by-id');

    function runother() {
        f.start();
        scientificAPI('Award', '-award-by-id',yui);
    }
    $('#bianji').click(runother);
}

//国家医药证书
function Medicine(){
    var f = changeinnerHtml("Medicine");
    f.common("证书名称*", "certificateName");
var options = ['是','否'];
    f.select(options,"是否具有代表性*",'isRepresentativeness');
    f.common("证书批号*", "certificateNumber");
var options = ['10-独立完成','20-第一完成人','30-第二完成人','99-其他'];
    f.select(options,"本人角色*",'selfRole');
    f.time("颁发时间*", "awardTime");var yui =['awardTime'];
    f.time("有效期*", "validityPeriod");var yui =['validityPeriod'];
    

    
    f.start2();
    scientificAPI('Medicine', '-medicine-by-id');

    function runother() {
        f.start();
        scientificAPI('Medicine', '-medicine-by-id',yui);
    }
    $('#bianji').click(runother);
}

//论文部分
function Paper(){
    var f = changeinnerHtml("Paper");
    f.common("论文名称*", "paperName");
var options = ['是','否'];
    f.select(options,"是否具有代表性*",'isRepresentativeness');
    f.common("期刊名称*", "journalName");
    f.time("发表年月*", "publishedTime");var yui =['publishedTime'];
    f.common("卷号*", "volumeNumber");
    f.common("期号*", "issue");
    f.common("起始页码*", "beginPageNumber");
    f.common("结束页码*", "endPageNumber");
var options = ['10-独立完成','11-第一作者','12-通讯作者','99-其他'];
    f.select(options,"本人角色",'selfRole');
    f.common("学科领域*", "subjectAreas");
    f.common("收录情况*", "includedState");

    f.start2();
    scientificAPI('Paper', '-paper-by-id');

    function runother() {
        f.start();
        scientificAPI('Paper', '-paper-by-id',yui);
    }
    $('#bianji').click(runother);
}

//专利部分
function Patent(){
    var x = 'Patent';
    var y ='patent';
    var f = changeinnerHtml(x);
var options = ['1-发明','2-实用新型','3-外观设计','4-专利合作协定(PCT)或外国申请','5-软件著作权','0-无'];
    f.select(options,"专利或软件著作权类型 *",'type');
var options = ['是','否'];
    f.select(options,"是否具有代表性 o",'isRepresentativeness');
    f.common("专利名称 o", "patentName");
    f.common("学科领域 o", "subjectAreas");
    f.time("批准日期 o", "approveTime");var yui =['approveTime'];
    f.common("本人角色 o", "selfRole");
    f.common("专利号 o", "patentNumber");



    
    f.start2();
    scientificAPI(x, '-'+y+'-by-id');

    function runother() {
        f.start();
        scientificAPI(x, '-'+y+'-by-id',yui);
    }
    $('#bianji').click(runother);
}

//项目或者课题
function Project(){
    var x = 'Project';
    var y ='project'; 
    var f = changeinnerHtml(x);
var options = ['1-基础研究','2-应用研究','3-教学研究','4-教材编写','5-教育改革试验','6-教具标本制作','7-课件开发','9-其他','0-无'];
    f.select(options,"项目类型*",'type');
var options = ['是','否'];
    f.select(options,"是否具有代表性o",'isRepresentativeness');
    f.common("项目名称o", "projectName");
    f.common("项目批准号o", "approveNumber");
    f.common("学科领域o", "subjectAreas");
    f.common("项目经费额度o", "funding");
    f.time("开始年月o", "beginTime");var yui =['beginTime','endTime'];
    f.time("结束年月o", "endTime");
var options = ['01-独立完成','02-项目主要负责人','03-项目主要参加者','99-其他'];
    f.select(options,"本人角色",'selfRole');
var options = ['1-1','2-2','3-3','0-无','9-其他'];
    f.select(options,"本人排名",'selfRank');
    f.common("项目委托单位", "authorizedUnit");
    f.common("项目来源", "projectSource");

    f.start2();
    scientificAPI(x, '-'+y+'-by-id');

    function runother() {
        f.start();
        scientificAPI(x, '-'+y+'-by-id',yui);
    }
    $('#bianji').click(runother);
}

//国家标准或行业标准
function Standard(){
    var x = 'Standard';
    var y ='standard';
    var f = changeinnerHtml(x);
    f.common("标准号*", "standardNubmer");
var options = ['是','否'];
    f.select(options,"是否具有代表性*",'isRepresentativeness');
 var options = ['10-独立完成','20-第一作者','30-第二作者','99-其他'];
    f.select(options,"本人角色*",'selfRole');
    f.time("发布日期*", "releaseDate");var yui =['releaseDate'];
    f.common("发布单位名称*", "unitName");

    f.start2();
    scientificAPI(x, '-'+y+'-by-id');

    function runother() {
        f.start();
        scientificAPI(x, '-'+y+'-by-id',yui);
    }
    $('#bianji').click(runother);
}

//指导学生获奖
function Student(){
    var x = 'Student';
    var y ='student';
    var f = changeinnerHtml(x);
    f.common("奖励名称*", "awardName");
var options = ['是','否'];
    f.select(options,"是否具有代表性*",'isRepresentativeness');
var options = ['独立指导老师','第一指导老师','第二指导老师','其他'];
    f.select(options,"代表角色*",'selfRole');
    f.common("获奖等级*", "awardLevel");
    f.time("获奖年月*", "awardTime");var yui =['awardTime'];
    f.common("个人工作描述*", "selfWorkDescription");
   



    f.start2();
    scientificAPI(x, '-'+y+'-by-id');

    function runother() {
        f.start();
        scientificAPI(x, '-'+y+'-by-id',yui);
    }
    $('#bianji').click(runother);
}

//咨询报告或研究报告
function Study(){
    var x = 'Study';
    var y ='study';
    var f = changeinnerHtml(x);
    f.common("报告项目*", "title");
var options = ['是','否'];
    f.select(options,"是否具有代表性*",'isRepresentativeness');
 var options = ['10-独立完成','20-第一作者','30-第二作者','99-其他'];
    f.select(options,"本人角色*",'selfRole');
    f.time("报告时间*", "reportTime");var yui =['reportTime'];
    f.common("委托方*", "entrustingParty");



    f.start2();
    scientificAPI(x, '-'+y+'-by-id');

    function runother() {
        f.start();
        scientificAPI(x, '-'+y+'-by-id',yui);
    }
    $('#bianji').click(runother);
}

//著作类
function Writings(){
    var x = 'Writings';
    var y ='writing';
    var f = changeinnerHtml(x);
    f.common("著作类别*", "type");
var options = ['是','否'];
    f.select(options,"是否具有代表性",'isRepresentativeness');
    f.common("著作名称o", "writingsName");
    f.common("学科领域o", "subjectAreas");
    f.time("出版日期o", "publicationDate");var yui =['publicationDate'];
    f.common("出版社名称o", "publicationName");
    f.common("出版号o", "numbers");
var options = ['04-独著','05-主编','06-副主编','07-作者','08-编写者','09-译者','99-其他'];
    f.select(options,"本人角色o",'selfRole');
    f.common("总字数o", "totalWords");
    f.common("本人撰写字数o", "selfWords");
    


    
    f.start2();
    scientificAPI(x, '-'+y+'-by-id');

    function runother() {
        f.start();
        scientificAPI(x, '-'+y+'-by-id',yui);
    }
    $('#bianji').click(runother);
}