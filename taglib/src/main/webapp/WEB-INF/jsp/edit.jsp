<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<<jsp:include page="header.jsp"></jsp:include>

<div class="container">

<h3>Customer</h3>
<form action='/index/update' method='post'>
 

 
       <b>Name</b>
            <input type='text' name='name' class='form-control' value="${customer.name}" />


<b>Address</b>
         <input type='text' name='address' class='form-control' value="${customer.address}" />
    <b>Contact</b>
          <input type='text' name='contact' class='form-control' size="20" value="${customer.contact}" />

 
 			<input type='hidden' id='id' rows='5' class='form-control' name='id' value="${customer.id}"/>
    <br><br>


                <button type="submit" class="btn btn-primary">Update</button>


</form>


</div>

<jsp:include page="footer.jsp"></jsp:include>