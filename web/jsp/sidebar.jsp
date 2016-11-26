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
        	<li class="hidden-xs navbar-brand">
        		<img src="../img/LOGO.png" alt="UHAC"/>
        	</li>
        	<li class="profile">
        		<img src="../../img/happy.png" alt="profile picture"/>
        		<p>Username</p>
        	</li>
        	
        <!-- if (user.equals("customer")) { -->   
        	<li><a href="customerProfile.jsp">Profile</a></li>
        	<li><a href="customerTransactions.jsp">All Transactions</a></li>
        	<li><a href="customerNewTransaction.jsp">Order Medicine</a></li>
        	<li><a href="faq.jsp">FAQ</a></li>
        <!-- } else if (user.equals("rider")) { -->
        	<li><a href="courierProfile.jsp">Profile</a></li>
        	<li><a href="courierTransactions.jsp">All Transactions</a></li>
        	<li><a href="faq.jsp">FAQ</a></li>
        <!-- } else { -->
        	<li><a href="adminProfile.jsp">Profile</a></li>
        	<li><a href="adminTransactions.jsp">All Transactions</a></li>
        	<li><a href="adminUsers.jsp">All Users</a></li>
        	<li><a href="faq.jsp">FAQ</a></li>
        <!-- } -->
        
        	<li class="logout"><a href="../../index.jsp">Logout</a></li>
      	</ul>
	</div>
	</nav>
</div>