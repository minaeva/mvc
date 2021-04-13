<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<body>

<h2>Enter details</h2>

<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"></form:input><form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"></form:input><form:errors path="surname"/>
    <br><br>
    Email <form:input path="email"></form:input><form:errors path="email"/>
    <br><br>
    Salary <form:input path="salary"></form:input>
    <br><br>
    Department <form:select path="department">

    <form:options items="${employee.departments}"></form:options>

    <%--    <form:option value="IT" label="info tech"></form:option>--%>
    <%--    <form:option value="HR" label="human"></form:option>--%>
    <%--    <form:option value="SALES" label="sales"></form:option>--%>
</form:select>
    <h4>What car?</h4>

    Ford <form:radiobutton path="carBrand" value="ford"></form:radiobutton>
    <br><br>
    Audi <form:radiobutton path="carBrand" value="audi"></form:radiobutton>
    <br><br>
    R2 <form:radiobutton path="carBrand" value="r2"></form:radiobutton>
    <br><br>
    Languages:
    EN <form:checkbox path="languages" value="eng"/>
    DE <form:checkbox path="languages" value="german"/>
    FR <form:checkbox path="languages" value="fr"/>
    UA <form:checkbox path="languages" value="ukr"/>
    <input type="submit" value="submit">
</form:form>
<%--    <input type="text" name="empName" placeholder="enter your name">--%>
<%--    <input type="text" name="empSurname" placeholder="enter your surname">--%>
<%--    <input type="submit">--%>
<%--</form:form>--%>


</body>
</html>
