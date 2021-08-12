<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<h1>New Language</h1>
<form:form action="/languages" method="post" modelAttribute="language">
    <p>
        <form:label path="creator">Creator:</form:label>
        <form:errors path="creator"/>
        <form:input path="creator"/>
    </p>
    <p>
        <form:label path="version">Version:</form:label>
        <form:errors path="version"/>
        <form:textarea path="version"/>
    </p>
    <p>
        <form:label path="language">Language:</form:label>
        <form:errors path="language"/>
        <form:input path="language"/>
    </p>
    <p>
        <form:label path="numberOfPages">Pages</form:label>
        <form:errors path="numberOfPages"/>     
        <form:input type="number" path="numberOfPages"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>    

