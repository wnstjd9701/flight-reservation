<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!--::header part start::-->
<header class="main_menu">
	<div class="main_menu_iner">
		<div class="container">
			<div class="row align-items-center ">
				<div class="col-lg-12">
					<nav
						class="navbar navbar-expand-lg navbar-light justify-content-between">
						<a class="navbar-brand" href="<c:url value='/'/>"> <img
							src="<c:url value='/img/logo.png'/>" alt="logo">
						</a>
						<button class="navbar-toggler" type="button"
							data-toggle="collapse" data-target="#navbarSupportedContent"
							aria-controls="navbarSupportedContent" aria-expanded="false"
							aria-label="Toggle navigation">
							<span class="navbar-toggler-icon"></span>
						</button>
						<div>
							<div
								class="collapse navbar-collapse main-menu-item justify-content-space-between"
								id="navbarSupportedContent">
								<ul class="navbar-nav">
									<li class="nav-item"><a class="nav-link"
										href="<c:url value='/'/>">Home</a></li>
									<li class="nav-item"><a class="nav-link"
										href="<c:url value='/board/qna'/>">QnA</a></li>
									<li class="nav-item"><a class="nav-link"
										href="<c:url value='/member/mp'/>">MyPage</a></li>
									<li class="nav-item"><a class="nav-link"
										href="<c:url value='/'/>">Logout</a></li>
								</ul>
							</div>
						</div>
					</nav>
				</div>
			</div>
		</div>
	</div>
</header>