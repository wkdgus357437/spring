/*버튼을 클릭하여 페이지를 이동했을 때 클래스 속성 부여*/
$(function(){
	let query = window.location.search;
	let param = new URLSearchParams(query);
	let num = param.get('num');
	
	if(num == 1){
		$('#home').addClass('footer-item active');
		
	}else if(num == 2){
		$('#order').addClass('footer-item active');
	
	}else if(num == 3){
		$('#cart').addClass('footer-item active');
	
	}else if(num == 4){
		$('#others').addClass('footer-item active');
	
	}
});