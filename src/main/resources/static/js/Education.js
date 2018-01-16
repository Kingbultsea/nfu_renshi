/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function changeVueAPI(elementId,api,keys){
    var key = keys;
    
    
    var q =new Vue({
        el:'#'+elementId,
        data:{
            url: "/api/common/",
            data:{},
            databack: {},
            id:'1',
            mean:'编辑'
            
        },
        methods:{
            get:function(){
                var a  = this.url +'get'+api;
                this.$http.get(a, {params: {id:1}}).then(function (response) {
                    var s = response.bodyText;
                    if(s !== null && s !== undefined && s !== ''){
                    this.data = $.parseJSON(response.bodyText);
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

function changeinnerHtml(id){
    var content = '',that={},content2 = '';
    that.common = function(name,key){
        content += "<div style='width:130px;height: 16px;display: inline-block'>"+name+":</div><input style='width:300px;height:20px;font-size: 16px;padding-left: 30px;border: 2px black solid;border-radius: 10px;' v-model='data."+key+"'/><br/><br/>";
        content2 += "<div style='width:330px;height: 16px;display: inline-block'>"+name+":{{data."+key+"}}</div><br/><br/>";
    };
    
    that.select = function(options,name,key){
        var option = null;
        for(var q in options){
            option +="<option>"+options[q]+"</option>";
        }

        content += "<div style='width:130px;height: 16px;display: inline-block'>"+name+":</div><select v-model='data."+key+"' style='width:300px;height:30px;font-size: 16px;padding-left: 30px;border: 2px black solid;border-radius: 10px;' ><option disabled value=''>请选择一个</option>"+ option+"</select><br/><br/>";
        content2 +="<div style='width:330px;height: 16px;display: inline-block'>"+name+":{{data."+key+"}}</div><br/><br/>";
    };
    
    that.time = function(name,key){
        content += "<div style='width:130px;height: 16px;display: inline-block'>"+name+":</div><input type='date' style='width:300px;height:20px;font-size: 16px;padding-left: 30px;border: 2px black solid;border-radius: 10px;' v-model='data."+key+"' id='"+key+"'/><br/><br/>";
        content2 += "<div style='width:330px;height: 16px;display: inline-block'>"+name+":{{data."+key+"}}</div><br/><br/>";
        
    };
    
    that.start = function(){
        
        
        $('#左右侧内容模板').html(
                
                "<div style='width:960px;' id='"+id+"'>"+content
                
                +"<div style='margin: 0 auto;width: 430px;background-color: #3333ff;height: 30px;font-size: 19px;color:#ffffff;text-align: center;font-weight: 700;'  v-on:click = 'back()' >提交</div><br/>"
                
                + "</div>");
        
    
    };
    
   that.start2 = function(){$('#左右侧内容模板').html(
                "<div style='width:960px;' id='"+id+"'>"+content2
                
                +"<div style='margin: 0 auto;width: 430px;background-color: #3333ff;height: 30px;font-size: 19px;color:#ffffff;text-align: center;font-weight: 700;' v-on:click = '' id='bianji' >编辑</div><br/>"
                
                + "</div>");
    
    };
    return that;
    
}


//联系方式
function Contract(){
    //contact


        var f = changeinnerHtml("Contract");

    f.common("通讯住址", "address");
    f.common("电话号*", "phoneNumber");
    f.common("手机号*", "telNumber");
    f.common("邮箱*", "email");
    f.common("其他联系方式", "otherTelNumber");
    f.common("紧急联系人", "emergencyContact");
    f.common("紧急联系人号码", "emergencyNumber");

    f.start2();
    changeVueAPI('Contract', '-contact-by-id');

    function runother() {
        f.start();
        changeVueAPI('Contract', '-contact-by-id','ff');
    }

    $('#bianji').click(runother);
    
}


//教育教学
function Education(){
  
    
        var f = changeinnerHtml("Education");

    f.common("年度*", "years");
var options = ['1-上半年','2-下半年','9-其他'];
    f.select(options,"学期*",'term');
var options = ['1-博士生导师','2-硕士生导师','3-博士、硕士导师','0-无'];
    f.select(options,"导师类别*",'mentorCategory');
    f.common("现主要从事学科领域 o", "nowScienceArea");
var options = ['是','否'];
    f.select(options,"是否为本科生上课*",'isForUndergraduate');
    f.common("课程教学课时数 o", "teachingHours");
    f.common("其他工作折合课时数 o", "otherHours");
    


    f.start2();
    changeVueAPI('Education', '-education-by-id');

    function runother() {
        f.start();
        changeVueAPI('Education', '-education-by-id','ff');
    }

    $('#bianji').click(runother);
    
    
}

 //用户基础信息
 function info(){

            var f = changeinnerHtml("Education");
    f.common("姓名*", "name");
    f.common("曾用名", "oldName");
var options = ['0-未知的性别','1-男','2-女','9-未说明的性别'];
    f.select(options,"性别*",'sex');    
    f.common('教职工号','workNumber');
    f.common('国籍/地区*','nationality');
var options = ['1-居民身份证','2-军官证','3-士兵证','6-残疾'];
    f.select(options,"身份证件类型*",'idCardType');    
    f.common('身份证件号*','idCardNumber');
    f.time('出生日期*','birthDate');var yui =['birthDate','joinWorkDate','joinSchoolDate'];
    f.common('籍贯','nativePlace');
    f.common('出生地（行政区划代码）*','nativeHeath');
    f.common('民族 o','nation');
    f.common('政治面貌 o','politicalOutlook');
    f.common('婚姻状况*','maritalStatus');
var options = ['1-健康或良好','2-一般或较弱','3-有慢性病','4-文职干部证','5-部队离退休证','6-香港特区护照/身份证明','7-澳门特区护照/身份证明','8-台湾居民来往大陆通行证','9-境外永久居住证','A-护照','B-户口薄','Z-其他'];
    f.select(options,"健康状况*",'healthStatus');
    f.time('参加工作年月*','joinWorkDate');
    f.time('进本校年月*','joinSchoolDate');
    f.common('教职工来源*','employeeOrigin');
    f.common('学缘结构*','marginStructure');
    f.common('教职工类别*','workType');
var options = ['是','否'];
    f.select(options,"是否在编*",'isOrganization');
    f.common('用人形式 o','humanForm');
var options = ['0-未签合同','1-聘用合同','2-劳动合同、3-其他合同'];
    f.select(options,"签订合同情况*",'signContract');
    f.common('在二级单位','organisation');
var options = ['100-在本单位任职','201-暂未在本单位任职-借出到机关','202-暂未在本单位任职-借出到事业单位','203-暂未在本单位任职-长病假','204-暂未在本单位任职-进修','205-暂未在本单位任职-交流轮岗','206-暂未在本单位任职-企业实践','207-暂未在本单位任职-因公出国','208-暂未在本单位任职-离岗创业','209-暂未在本单位任职-待退休','210-暂未在本单位任职-待岗','211-暂未在本单位任职-下落不明','299-暂未在本单位任职-其他'];
    f.select(options,"人员状态*",'stateOfPersonnel');
    

    f.start2();
    changeVueAPI('Education', '-info-by-id');

    function runother() {
        f.start();
        changeVueAPI('Education', '-info-by-id',yui);
    }

    $('#bianji').click(runother);
    
     
 }



//学习经历
function  LearnExperience(){

        var f = changeinnerHtml("LearnExperience");

    f.common("获得学历*", "educational");
    f.common("获得学历的国家(地区) o", "country");
    f.common("获得学历的院校或机构 o", "university");
    f.common("所学专业 o", "majors");
    f.time("入学年月o", "beginTime");var yui =['beginTime','endTime','degreeAwardedTime'];
    f.time("毕业年月o", "endTime");
 var options = ['2-博士','3-硕士','4-学士','0-无'];
    f.select(options,"学位层次 *",'degree');
    f.common("学位名称 o", "degreeName");
    f.time("学位授予年月 o", "degreeAwardedTime");
var options = ['1-全脱产（离岗）','2-半脱产（半离岗）','3-不脱产（不离岗）'];
    f.select(options,"学习方式 *",'learningStyle');  
    f.common("在学单位类别 *", "schoolClasses");
    
  

    f.start2();
    changeVueAPI('LearnExperience', '-learning-by-id');

    function runother() {
        f.start();
        changeVueAPI('LearnExperience', '-learning-by-id',yui);
    }

    $('#bianji').click(runother);
    
    
}


//专业职务任聘
function ProfessionalDuties(){
    var f = changeinnerHtml("ProfessionalDuties");
    
    f.common("聘任专业技术职务 *","duty");
    f.time("开始时间o","beginTime");var yui =['beginTime','endTime'];
    f.time("解任时间","endTime");
    f.common("单位名称","unitName");
    
    var options = ['是','否'];
    f.select(options,"是否已获得同级别专业技术资格证书",'isHasSameLevel');
    
        f.start2();
        
     changeVueAPI('ProfessionalDuties','-profession-by-id');
   
   function runother(){
        f.start();
     changeVueAPI('ProfessionalDuties','-profession-by-id',yui);
   }
   
   $('#bianji').click(runother);
   
   
}


//入选人才项目
function TalentProject(){
    var f = changeinnerHtml("TalentProject");

    f.common("入选人才项目名称 *", "projectName");
    f.time("入选年份 o", "years");var yui =['years'];



    f.start2();
    changeVueAPI('TalentProject', '-talent-by-id');

    function runother() {
        f.start();
        changeVueAPI('TalentProject', '-talent-by-id',yui);
    }

    $('#bianji').click(runother);
    
}


//荣耀信息
function TeacherEthics(){
    var f = changeinnerHtml("TeacherEthics");

    var options = ['1-国家级','2-省级','3-地市级','4-县级','5-基层单位荣耀称号','8-国际国外荣耀称号','0-无'];
    f.select(options,"荣誉级别*",'level');
    f.common("获得荣誉称号 o", "honorName");
    f.time("荣誉发生日期 o(yyyy-mm-dd)", "honorTime");var yui =['honorTime'];
    f.common("荣誉记录描述 o", "honorDescribe");
    f.common("荣誉授予单位名称 o", "unitName");
    
    





    f.start2();
    changeVueAPI('TeacherEthics', '-teacherEthics-by-id');

    function runother() {
        f.start();
        changeVueAPI('TeacherEthics', '-teacherEthics-by-id',yui);
    }

    $('#bianji').click(runother);
    
}

//教师资格信息
function TeacherQualification(){
    var f = changeinnerHtml("TeacherQualification");

var options = ['1-幼儿园教师资格','2-小学教师资格','3-初级中学教师资格','4-高级中学教师资格','6-中等职业学校实习指导教师资格','7-高等学校教师资格','0-无'];
    f.select(options,"教师资格证种类*",'qualificationType');
    f.common("资格证号码 o", "qualificationNumber");
    f.common("任教学科 o", "subject");
    f.time("颁发日期 o", "dateOfIssuance");var yui =['dateOfIssuance'];
    f.common("颁发机构 o", "lssuingUnit");
    
    f.start2();
    changeVueAPI('TeacherQualification', '-teaQual-by-id');

    function runother() {
        f.start();
        changeVueAPI('TeacherQualification', '-teaQual-by-id',yui);
    }

    $('#bianji').click(runother);
    
}

//工作经历
function WorkExperience(){
    var f = changeinnerHtml("WorkExperience");

   
    f.common("任职单位名称*", "unitName");
    f.time("开始任职年月*", "beginTime");var yui =['beginTime','endTime'];
    f.time("离职年月", "endTime");
    f.common("单位性质类别*", "unitProperties");
    f.common("任职岗位*", "post");
    

    f.start2();
    changeVueAPI('WorkExperience', '-work-by-id');

    function runother() {
        f.start();
        changeVueAPI('WorkExperience', '-work-by-id',yui);
    }

    $('#bianji').click(runother);
    
}