<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<sec:authorize access="isRememberMe()">
	<c:redirect url="/dashboard.xhtml" />
</sec:authorize>

<sec:authorize access="isFullyAuthenticated()">
	<c:redirect url="/dashboard.xhtml" />
</sec:authorize>

<sec:authorize access="!isRememberMe()">
	<c:redirect url="/login.xhtml" />
</sec:authorize>

<sec:authorize access="!isFullyAuthenticated()">
	<c:redirect url="/login.xhtml" />
</sec:authorize>