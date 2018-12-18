<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp"></jsp:include>

<h3>Customer dashboard</h3>
<br>

<div class="container-fluid">
    <div class="row content">
        <div class="col-sm-6 ">

            <form action='/index/add' method='post'>


                <h5>Name</h5>
                <input type='text' name='name' class='form-control'  required/>

                <h5>Address</h5>
                <input type='text' name='address' class='form-control' required />

                <h5>Contact</h5>
                <input type='text' name='contact' class='form-control' size="20" required/>


                <br><br>

                <button type="submit" class="btn btn-primary">Save</button>



                <b><c:out value="${danger}"></c:out></b>
            </form>



        </div>

        <div class="col-sm-6">


            <br>
            <table class="table table-hover">

                <thead>
                <tr>
                    <th><b>Name</b></th>
                    <th><b>Address</b></th>
                    <th><b>Contact</b></th>

                </tr>
                </thead>
                <tbody>
                <c:forEach items="${list}" var="customer">
                    <tr>
                        <td><c:out value="${customer.name}"></c:out></td>
                        <td><c:out value="${customer.address}"></c:out></td>
                        <td><c:out value="${customer.contact}"></c:out></td>

                        <td>
                            <a href="/index/${customer.id}/edit">
                                <i class="fas fa-pen"></i>
                            </a>
                        </td>
                        <td>
                            <a href="/index/${customer.id}/delete">
                                <i class="fas fa-trash-alt"></i>
                            </a>
                        </td>
                    </tr>

                </c:forEach>
                </tbody>
            </table>
        </div>

    </div>
    </div>
</div>






<jsp:include page="footer.jsp"></jsp:include>