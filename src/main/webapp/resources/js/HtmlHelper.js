function doAction (idButton, idUser)
{
	if(idButton.match("annuler") || idButton.match("precedent"))
	{
		this.document.forms[0].action = "/learningengin/adminhome";
		this.document.forms[0].method = "GET"; 
	}

	
	
	if(idButton.match("ajouter"))
	{
		this.document.forms[0].action = "/odes-web/main/"+objectRef+"/ajouter";
		this.document.forms[0].method = "POST"; 
	}

	
	if(idButton.match("modifier"))
	{
		this.document.forms[0].action = "/learningengin/adminhome/user/" +idUser+ "/modify";
		this.document.forms[0].method = "POST"; 
	}

	
	this.document.forms[0].submit();
}



function prepareAction (action)
{

	if(action.match("prepareadd"))
	{
		this.document.forms[0].method = "GET"; 
		this.document.forms[0].action = action;
	}
		
		
	
	if(action.match("preparemodify"))
	{
		this.document.forms[0].method = "GET"; 
		this.document.forms[0].action = action;
	}

	
	this.document.forms[0].submit();
}



function supprimer(action, idUser)
{
	if(action.match("supprimer"))
	{ 
		
		if(confirm("Voulez vous supprimer d�finitivement ?"))
		{
			this.document.forms[0].action = action + '/' + idUser;
			this.document.forms[0].method = "POST"; 
			this.document.forms[0].submit();
		}
				
	}
}



function consulter(action, idBanque)
{
	if(action.match("consulter"))
	{
		this.document.forms[0].method = "GET"; 
		this.document.forms[0].action = action + '/' + idBanque	;
	}
	
	this.document.forms[0].submit();
}



function goTo(action)
{
	this.document.forms[0].action = action;	
	this.document.forms[0].submit();	
}


