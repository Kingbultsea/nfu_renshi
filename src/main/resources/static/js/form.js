/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 var form = {};
 
 
$(document).ready(function(){
     form.D1();
     form.D2();
     form.D3();
    $('.大选项').mouseleave(function () {
        $(this).css('height', '40px');
    });
 });

form.D1 = function (){
    //Education
    form.setD1('用户基础信息','info()');
    form.setD1('教育教学','Education()');
    form.setD1('联系方式','Contract()');
    form.setD1('学习经历','LearnExperience()');
    form.setD1('专业职务任聘','ProfessionalDuties()');
    form.setD1('入选人才项目','TalentProject()');
    form.setD1('荣耀信息','TeacherEthics()');
    form.setD1('教师资格信息','TeacherQualification()');
    form.setD1('工作经历','WorkExperience()');
//9
    $('.d1').mouseover(function () {
        $(this).css('height', '260px');
    });
   

};

form.setD1 = function(name,func){
    $(".d1").append("<p style=' text-align: center;position: relative;top:20px; ' onclick='"+func+"'>"+name+"</p>");
};

form.D2 = function(){
    form.setD2('艺术方面的科研成果','Art()');
    form.setD2('科研成果的奖励部分','Award()');
    form.setD2('国家医药证书','Medicine()');
    form.setD2('论文部分','Paper()');
    form.setD2('专利部分','Patent()');
    form.setD2('项目或者课题','Project()');
    form.setD2('国家标准或行业标准','Standard()');
    form.setD2('指导学生获奖','Student()');
    form.setD2('咨询报告或研究报告','Study()');
    form.setD2('著作类','Writings()');
    
    //10
    $('.d2').mouseover(function () {
        $(this).css('height', '280px');
    });
    
};

form.setD2 = function(name,func){
     $(".d2").append("<p style=' text-align: center;position: relative;top:20px; ' onclick='"+func+"'>"+name+"</p>");
};

form.D3 = function(){
    form.setD3('国内培训','DomesticTraining()');
    form.setD3('语言能力','LanguageSkill()');
    form.setD3('其余能力','OtherSkill()');
    form.setD3('海外培训','OverseasTraining()');
    form.setD3('技能证书','SkillCertificate()');
    
    //5
    $('.d3').mouseover(function () {
        $(this).css('height', '150px');
    });
    
};

form.setD3 = function(name,func){
     $(".d3").append("<p style=' text-align: center;position: relative;top:20px; ' onclick='"+func+"'>"+name+"</p>");
};