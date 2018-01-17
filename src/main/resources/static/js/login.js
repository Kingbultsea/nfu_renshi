/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var login;
var id;
var x;
 $(document).ready(function(){
     login();
     
 });
 
 function login_true(){
     login.show = true;
 }
 
 function login(){
      login = new Vue({
         el:'#login',
         data:{
             username:'',
             password:'',
             get:null,
             url:'/admin/login',
             show:false
         },
         methods:{
             submit:function(){
                this.$http.get(this.url, {params: {userName:this.username,passwd:this.password}}).then(function (response) {
                    var cookie = document.cookie ;
                 if(response.bodyText === 'success'){
                     this.show = false;
                     $("#Register").hide();
                     $("#needHide").html("欢迎"+cookie);
                 }
                },
                        function (e) {
                            alert('');
                        });
             }
         }
     });
     
 }
