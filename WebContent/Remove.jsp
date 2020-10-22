<%@include file="header.jsp" %>

  
  <main role="main" class="inner cover ">
   <h1>Remove Student </h1>
  <form action="RemoveStudent"  class="container">
   <div class="form-group ">
    <label for="exampleInputName1">Name of Student to delete</label>
    <input type="text" name="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
  
  <button type="submit" class="btn btn-danger">Remove</button>
</form>

  </main>
  
  <%@include file="footer.jsp" %>
  