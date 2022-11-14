<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 상세</title>
<script type="text/javascript" src="/resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript" src="/resources/ckeditor/ckeditor.js"></script>
</head>
<body>
<!-- JSTL format을 이용하여 천단위 구분기호를 적용할 수 있음 -->
<!-- JSTL format을 이용하여 날짜 포멧을 적용할 수 있음 -->
<div class="col-md-6" style="width=100%;">
   <form name="frm" id="frm" method="post">
   <div class="card card-primary" style="width:100%;">
   	<div class="card-header">
		<h3 class="card-title">${bodyDetail}</h3>
	</div>
  
   <div class="card-body">
         <div class="form-group">
            <label>제목</label>
            <div class="input-group date" id="reservationdatetime" data-target-input="nearest">
               <input type="text" class="form-control rounded-0" name="title" value="${bookVO.title}" readonly>
            </div>
         </div>
         <div class="form-group">
            <label>카테고리</label>
            <div class="input-group date" id="reservationdatetime" data-target-input="nearest">
               <input type="text" class="form-control rounded-0" name="category" value="${bookVO.category}" readonly>
            </div>
         </div>
         <div class="form-group">
            <label>가격</label>
            <div class="input-group date" id="reservationdatetime" data-target-input="nearest">
               <input type="text" class="form-control rounded-0" name="price" value="<fmt:formatNumber value='${bookVO.price}' pattern='#,###' />" readonly>
            </div>
         
         </div>
         <div class="form-group">
            <label>입력일자</label>
            <div class="input-group" id="reservationdatetime" data-target-input="nearest">
               <input type="date" id="txtPrice" name="insertDate" class="form-control" value="<fmt:formatDate value='${bookVO.insertDate}' pattern='yyyy-MM-dd' />" readonly>
            </div>
         </div>
         	<div class="form-group">
            <label>내용 :</label>
	            <div class="input-group date" id="reservationdatetime" data-target-input="nearest">
	            	<textarea id="content"  name="content" class="form-control" rows="4" style="height: 124px;" readonly >${bookVO.content}</textarea>
	            </div>
            </div>
      </div>
      
      <!-- 일반모드 시작 -->
      <div id="spn1" class="card-footer"  style="display:flex; justify-content:flex-end;">
          <a href="/book/list"><input type="button" value="목록" class="btn btn-success" /></a>
           <input type="button" id="edit" value="수정" class="btn btn-warning" style="margin-left:5px; margin-right:8px;" />
        </div>
        <!-- 일반모드 끝 -->
        <!-- 수정모드 시작 -->
      <div id="spn2" class="card-footer" style="display:none; justify-content:flex-end;">
          <a href="/book/update"><button type="submit" class="btn btn-success" >확인</button></a>
           <a href="/book/detail?bookId=${bookVO.bookId}"><button type="button" class="btn btn-danger" style="margin-left:5px; margin-right:8px;">취소</button></a>
        </div>
        <!-- 수정모드 끝 -->
   </div>
   </form>
	<form action="/book/delete" method="post">
		<div id="spn1" class="card-footer"  style="display:flex; justify-content:flex-end;">
			<input type="hidden" name="bookId" value="${bookVO.bookId}" />
			<input type="submit" value="삭제" class="btn btn-warning" style="margin-left:5px; margin-right:8px;"  />
		</div>
	</form>
</div>

<script type="text/javascript">
   $(function() {
      // 수정버튼 클릭 -> 수정모드로 전환
      $("#edit").on("click", function() {
         $("#spn1").css("display", "none");
         $("#spn2").css("display", "flex");
         // 제목, 카테고리, 가격은 수정 가능 but, 입력일자는 readonly 유지
         $(".rounded-0").attr("readonly", false);
         
         $("#content").attr("readonly", false);
         // 제목, 카테고리, 가격의 required 속성 추가
         $(".rounded-0").attr("required", true);
         // form action 추가
         $("#frm").attr("action", "/book/updatePost");
      });
      // 숫자입력 validate
      $("#txtPrice").on("keyup", function() {
         $(this).val($(this).val().replace(/[^0-9]/g, ""));
      });
   });
</script>
<script type="text/javascript">
	CKEDITOR.replace("content");
</script>
</body>
</html>

<!-- 	$('#end_date').prop('readonly', true); -->
<!-- 	CKEDITOR.instances['outline'].setReadOnly(true); -->