
<%@include file="header.jsp" %>
  



  <main role="main" class="inner cover ">
   <h1>Add Student </h1>
  <form action="InsertStudent" method="post" class="container">
   <div class="form-group ">
    <label for="exampleInputName1">Name</label>
    <input type="text" name="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <small id="emailHelp" class="form-text text-muted">We'll share your name with anyone :p.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email"  name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password"  name="password" class="form-control" id="exampleInputPassword1">
        <small id="emailHelp" class="form-text text-muted">We'll never share your password with anyone else.</small>
    
  </div>
  <div class="form-group ">
    <label for="exampleInputName1">Country</label>
   <div class="input-group mb-3">
  <select class="custom-select" id="inputGroupSelect02" name="country">
   
    <option value="Tunisia" selected>Tunisia</option>
    <option value="Sousse">Sousse</option>
    <option value="Djerba">Djerba</option>
  </select>
  </div>
  
</div>
  
  <button type="submit" class="btn btn-info">Submit</button>
</form>


  </main>

 <%@include file="footer.jsp" %>