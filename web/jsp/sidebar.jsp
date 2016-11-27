<%@page import="uhac.model.UserInfoBean" %>
<%@page import="java.sql.*" %>
<%UserInfoBean user = (UserInfoBean) session.getAttribute("user"); %>
<%ResultSet records = (ResultSet) session.getAttribute("records"); %>
<%ResultSet userALL = (ResultSet) session.getAttribute("userALL"); %>
<%ResultSet medicineALL = (ResultSet) session.getAttribute("medicineALL"); %>
<div id="sidebar-black" class="sidebar-nav">
	<nav id="navbar-black" class="navbar navbar-default" role="navigation">
	
	<div class="navbar-header">
		<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-navbar-collapse">
			<span class="sr-only">Toggle navigation</span>
        	<span class="icon-bar"></span>
        	<span class="icon-bar"></span>
        	<span class="icon-bar"></span>
      	</button>
      	<span class="visible-xs">UHAC</span>
    </div>
    
    <div class="navbar-collapse collapse sidebar-navbar-collapse">
    	<ul class="nav navbar-nav">
        	<li class="hidden-xs navbar-brand">UHAC
        	</li>
        	<li class="profile">
        		<img src="../../img/happy.png" alt="profile picture"/>
        		<p><%=user.getFirstName() %> <%=user.getMiddleName() %><%=user.getLastName() %></p>
        	</li>
        	
        <%  if (user.getRole() == 3) {%> 
        	<li><a href="../customer/customerProfile.jsp">Profile</a></li>
        	<li><a href="../customer/customerTransactions.jsp">All Transactions</a></li>
        	<li><a href="../customer/customerNewTransaction.jsp">Order Medicine</a></li>
         <% }else if (user.getRole() == 2) {%>
        	<li><a href="../courier/courierProfile.jsp">Profile</a></li>
        	<li><a href="../courier/courierTransactions.jsp">All Transactions</a></li>
      <% }else if (user.getRole() == 1) {%>
        	<li><a href="../admin/adminProfile.jsp">Profile</a></li>
        	<li><a href="../admin/adminTransactions.jsp">All Transactions</a></li>
        	<li><a href="../admin/adminTrackOrders.jsp">Track Incoming Orders</a></li>
        	<li><a href="../admin/adminUsers.jsp">All Users</a></li>
       <% }%>
        
        	<li><a href="../faq.jsp">FAQ</a></li>
        	<li class="logout"><a href="../../index.jsp">Logout</a></li>
      	</ul>
	</div>
	</nav>
</div>