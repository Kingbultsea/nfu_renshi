/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var a;
var id;
var x;
 $(document).ready(function(){
     login();
     
 });
 
 function login(){
      a = new Vue({
         el:'#login',
         data:{
             username:'sky',
             password:'123',
             get:null,
             url:'http://jjs5dg.natappfree.cc/admin/login',
             show:false
         },
         methods:{
             submit:function(){
                this.$http.get(this.url, {params: {userName:this.username,passwd:this.password}}).then(function (response) {
                    
                 if(response.bodyText === 'success'){
                     this.show = false;
                     
                 }
                },
                        function (e) {
                            alert('');
                        });
             }
         }
     });
     
 }
