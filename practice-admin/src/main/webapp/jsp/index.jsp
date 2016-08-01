<%--
  Created by IntelliJ IDEA.
  User: li
  Date: 16-5-20
  Time: 下午7:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>贝叶斯DEMO</title>
    <script src="/beiyesi/resource/jquery-2.0.3.min.js"></script>
  </head>
  <body>
  <textarea id="remark" style="width:300px;height:200px;"></textarea>
  <input type="button" value="提交" onclick="getClass()">
  <label id="result"></label>
  <script type="text/javascript">
    function getClass(){

      var remark={};
      remark.context = $('#remark').val();
      $.ajax({
        type: 'POST',
        url: '/beiyesi/hello/class',
        data: JSON.stringify(remark),
        contentType: 'application/json', //设置请求头信息
        dataType: 'json',
        async: false,
        success: function (data) {

          $("#result").text("结果已按可能性降序排列 ："+data);
        }
      });
    }
  </script>
  </body>
</html>
