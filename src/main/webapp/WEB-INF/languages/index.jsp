<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<title>Languages</title>

<h1>All Languages</h1>
<table>
    <thead>
        <tr>
            <th>Language</th>
            <th>Creator</th>
            <th>Version</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${languages}" var="language">
        <tr>
            <td><c:out value="${language.language}"/></td>
            <td><c:out value="${language.creator}"/></td>
            <td><c:out value="${language.version}"/></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
<a href="/languages/new">New Language</a>