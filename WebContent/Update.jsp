<%@include file="header.jsp" %>


  <main role="main" class="inner cover ">
   <h1>Update Student infos </h1>
  <form action="Update"  class="container">
   <div class="form-group ">
    <label for="exampleInputName1" class="text-success">Name of Student to Modify</label>
    <input type="text" name="oldName" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
   <div class="form-group ">
    <label for="exampleInputName1">The new name</label>
    <input type="text" name="newName" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
   <div class="form-group ">
    <label for="exampleInputName1">the new adresse</label>
    <input type="text" name="newAdresse" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
  </div>
    <div class="form-group ">
    <label for="exampleInputName1">Country</label>
   <div class="input-group mb-3">
  <select class="custom-select" id="inputGroupSelect02" name="newCountry">
   
    <option value="Tunisia" selected>Tunisia</option>
    <option value="Sousse">Sousse</option>
    <option value="Djerba">Djerba</option>
  </select>
  </div>
  
</div>
  
  <button type="submit" class="btn btn-success">Change</button>
</form>


  </main>

<%@include file="footer.jsp" %>