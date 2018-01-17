/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function skillsAPI(elementId,api,keys){
    var key = keys;
    
    
    var q =new Vue({
        el:'#'+elementId,
        data:{
            url: "/api/skills/",
            data:{},
            databack: {},
            id:'1',
            mean:'编辑'
            
        },
        methods:{
            get:function(){
                
                var a  = this.url +'get'+api;
                this.$http.get(a, {params: {id:1}}).then(function (response) {
                    
                    if(response){
                       this.data = $.parseJSON(response.bodyText); 
                    }else{
                        this.add(this.id);
                    }
                    
                },function (e) {alert('');});
            },
            back:function(){
            
            if(key !== 'ff'){
                                  for( var q =0;q<key.length ; q++ ){
            var date = new Date(document.getElementById(key[q]).value);//可以传时间，也可以不传，不传的话就是默认的当前时间  
            
            var time3 = Date.parse(date);  
            this.data[ key[q] ] = time3;
        }  
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
    
   q.get();
    
}

//国内培训
function DomesticTraining(){
    var x = 'DomesticTraining';
    var y ='Dtraining';
    var f = changeinnerHtml(x);
    f.common("培训年度(如2016)*", "trainYear");
var options = ['10-国家级','20-省级','30-地市级','40-县级','60-校级','99-其他'];
    f.select(options,"培训类别*",'trainType');
    f.common("项目名称*", "projectName");
    f.common("培训机构*", "trainInstitutions");
 var options = ['1-长期脱产研修（一个月以上）','2-短期面授培训','3-网络研修','4-面授培训与网络研修相结合','9-其他'];
    f.select(options,"培训方式*",'trainMode');
    f.common("培训获得学时*", "trainGetTime");
    

    f.start2();
    scientificAPI(x, '-'+y+'-by-id');

    function runother() {
        f.start();
        scientificAPI(x, '-'+y+'-by-id','ff');
    }
    $('#bianji').click(runother);
}

//语言能力
function LanguageSkill(){
    var x = 'LanguageSkill';
    var y ='language';
    var f = changeinnerHtml(x);
    f.common("语言*", "language");
var options = ['1-精通','2-熟练','3-良好','4-一般'];
    f.select(options,"掌握程度*",'degreeOfMastery');



    
    f.start2();
    scientificAPI(x, '-'+y+'-by-id');

    function runother() {
        f.start();
        scientificAPI(x, '-'+y+'-by-id','ff');
    }
    $('#bianji').click(runother);
}

//其余能力
function OtherSkill(){
    var x = 'OtherSkill';
    var y ='other';
    var f = changeinnerHtml(x);
    f.common("其他技能名称*", "skillName");
var options = ['1-精通','2-熟练','3-良好','4-一般'];
    f.select(options,"掌握程度*",'degreeOfMastery');



    
    f.start2();
    scientificAPI(x, '-'+y+'-by-id');

    function runother() {
        f.start();
        scientificAPI(x, '-'+y+'-by-id','ff');
    }
    $('#bianji').click(runother);
}

//海外培训
function OverseasTraining(){
    var x = 'OverseasTraining';
    var y ='overtraining';
    var f = changeinnerHtml(x);
var options = ['是','否'];    
    f.select(options,"是否有海外访学经历", "isHasExperience");
    f.time("开始日期o", "beginTime");var yui = ['beginTime','endTime'];
    f.time("结束日期", "endTime");
    f.common("国家", "country");
    f.common("机构名称", "organizationName");
    f.common("项目名称", "projectName");
    f.common("组织单位名称", "organizationalUnit");
    
    
    f.start2();
    scientificAPI(x, '-'+y+'-by-id');

    function runother() {
        f.start();
        scientificAPI(x, '-'+y+'-by-id',yui);
    }
    $('#bianji').click(runother);
}

//技能证书
function SkillCertificate(){
    var x = 'SkillCertificate';
    var y ='certificate';
    var f = changeinnerHtml(x);
var options = ['1-职业技能等级证书','2-语言证书','3-计算机证书','9-其他证书','0-无'];
    f.select(options,"证书类型", "certificateType");
    f.common("语言证书名称", "languageCertificateName");
    f.common("证书名称", "certificateName");
    f.time("颁发年月", "years");var yui = ['years'];
    f.common("颁发单位", "lssuingUnit");
    f.common("证书号", "certificateNumber");
    
    
    f.start2();
    scientificAPI(x, '-'+y+'-by-id');

    function runother() {
        f.start();
        scientificAPI(x, '-'+y+'-by-id',yui);
    }
    $('#bianji').click(runother);
}