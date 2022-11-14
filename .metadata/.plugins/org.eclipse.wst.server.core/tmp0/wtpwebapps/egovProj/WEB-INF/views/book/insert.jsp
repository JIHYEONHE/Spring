<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script type="text/javascript" src="/resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript" src="/resources/ckeditor/ckeditor.js"></script>
<div class="col-md-6" style="width=100%;">
	<form method="post" action="/book/insertPost">
   <div class="card card-primary" style="width:100%;">
   	<div class="card-header">
		<h3 class="card-title">${bodyInsert}</h3>
	</div>
 <div class="card-body">
         <div class="form-group">
            <label>제목 :</label>
            <div class="input-group date" id="reservationdatetime" data-target-input="nearest">
               <input type="text" class="form-control rounded-0" name="title" required />
            </div>
         </div>
         <div class="form-group">
            <label>카테고리 :</label>
            <div class="input-group date" id="reservationdatetime" data-target-input="nearest">
               <input type="text" class="form-control rounded-0" name="category" required />
            </div>
         </div>
         <div class="form-group">
            <label>가격 :</label>
            <div class="input-group date" id="reservationdatetime" data-target-input="nearest">
               <input type="text" id="txtPrice" class="form-control rounded-0" name="price" required />
            </div>
         </div>
         <div class="form-group">
            <label>내용 :</label>
            <div class="input-group date" id="reservationdatetime" data-target-input="nearest">
            	<textarea id="content" name="content" class="form-control" rows="4" style="height: 124px;"></textarea>
            </div>
         </div>
         
      </div>
		<div class="card-footer" style="display:flex; justify-content:flex-end;">
			<button type="submit" class="btn btn-primary">등록</button>
			<a href="/book/list"><button type="button" class="btn btn-success" >취소</button></a>
		</div>
	</div>
	</form>
</div>
<script type="text/javascript">
   $(function() {
      // 숫자입력 validate
      $("#txtPrice").on("keyup", function() {
         $(this).val($(this).val().replace(/[^0-9]/g, ""));
      });
   });
</script>
<script type="text/javascript">
	CKEDITOR.replace("content");
</script>
