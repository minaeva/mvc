<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<body>

<h1>Your info:</h1>

<%--<h3>${param.empName}</h3>--%>
<h2>Name: ${employee.name}</h2>
<h2>Surname: ${employee.surname}</h2>
<h2>Salary: ${employee.salary}</h2>
<h2>Department: ${employee.department}</h2>
<h2>Your car: ${employee.carBrand}</h2>
<h2>Languages</h2>
<%--: ${employee.languages}</h2>--%>
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>

</body>
</html>
