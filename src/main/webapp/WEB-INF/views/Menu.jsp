<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="./resources/bootstrap.css" rel="stylesheet" type="text/css" media="screen" />
	<link href="./resources/datepicker.css" rel="stylesheet" type="text/css" media="screen" />
	<link href="./resources/demo.css" rel="stylesheet" type="text/css" media="screen" />
	
<title>Home</title>
</head>
<body>
	
	<!-- Variables URLs -->
	<% String url_home="", url_cours="", url_edt="", url_eval="", url_resul="", url_outil="", url_info="", url_param="", url_deco=""; 
	
		url_home	= "./home";
		url_cours	= "./studentCourses";
		url_edt		= "./EDT";
		url_eval	= "./assessment";
		url_resul	= "./mark";
		url_outil	= "./tools";
		url_info	= "./informations";
		url_param	= "./param";
		url_deco	= "./logout";
	%>
	
	
	<div style="margin: 10px" class=""> <!-- Conteneur menu -->		
	  <ul class="nav nav-pills col-md-9">
	  	  <li class="active"><a href="<%=url_home%>"><span class="glyphicon glyphicon-home"></span> Accueil</a></li>
		  <li ><a href="<%=url_cours %>"><span class="glyphicon glyphicon-book"></span> Mes cours</a></li>
		  <li ><a href="<%=url_edt %>"><span class="glyphicon glyphicon-time"></span> Emploi du temps</a></li>
		  <li ><a href="<%=url_eval %>"><span class="glyphicon glyphicon-th-list"></span> Evaluations</a></li>
		  <li ><a href="<%=url_resul %>"><span class="glyphicon glyphicon-list-alt"></span> Résultats</a></li>
<!-- 		  <li ><a href="<%=url_outil %>"><span class="glyphicon glyphicon-briefcase"></span> Outils</a></li>  -->
<!-- 		  <li ><a href="<%=url_info %>"><span class="glyphicon glyphicon-file"></span> Informations</a></li> -->
		</ul>
		
		<ul class="nav nav-pills pull-right">
		  <li><a href="<%=url_param %>"><span class="glyphicon glyphicon-wrench"></span> Paramètres</a></li>
		  <li><a href="<%=url_deco %>"><span class="glyphicon glyphicon-off"></span> Déconnexion</a></li>
		</ul>
		
	</div>
	<br><br>
