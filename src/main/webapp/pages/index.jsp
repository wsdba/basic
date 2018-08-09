<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>111n</title>
<meta name="keywords" content="后台登陆页面模板,后台登录界面html,后台登录模板,后台登录页面html,后台管理系统后台登录模板">
<meta name="description" content="cssmoban提供后台管理系统登录界面html模板学习和下载">
<meta name="viewport" content="width=device-width">
<link href="public/css/base.css" rel="stylesheet" type="text/css">
<link href="public/css/login.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class="login">
<form action="login.action" method="post" id="form">
	<div class="logo"></div>
    <div class="login_form">
    	<div class="user">
        	<input class="text_value" value="" name="username" type="text" id="username">
            <input class="text_value" value="" name="password" type="password" id="password">
        </div>
        <button class="button" id="submit" type="submit">登录</button>
    </div>
    
    <div id="tip"></div>
    <div class="foot">
    Copyright © 2011-2015  All Rights Reserved. More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
    </div>
    </form>
</div>
<script>var basedir='public/ui/';</script>
<script src="public/ui/do.js"></script>
<script src="public/ui/config.js"></script>
<script>
Do.ready('form', function() {
	$("#form").Validform({
			ajaxPost:true,
			postonce:true,
			tiptype:function(msg,o,cssctl){
				if(!o.obj.is("form")){
					var objtip=o.obj.siblings(".Validform_checktip");
					cssctl(objtip,o.type);
					objtip.text(msg);
				}else{
					var objtip=o.obj.find("#tip");
					cssctl(objtip,o.type);
					if(o.type==2){
						window.location.href='index.php?r=admin/index/index';
					}else{
						objtip.text(msg);
					}
				}
			}
	});
});

</script>
</body>
</html>
