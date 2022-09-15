# FromZerotoExpert

Html展示FromZerotoExpert

暂未部署服务器


增加Cookie记录，分别采用@CookieValue注解和HttpServletRequest两种方式进行cookie验证，
cookie键值为userHasVisited-true

增加注册功能，注册页面比较简陋，注册成功后会以Json格式返回success信息。检测若注册用户名相同会报错，还未写失败页面。
