<%
    String fn1 = request.getParameter("fn1");
    String fn2 = request.getParameter("fn2");
    
    int n1 = Integer.parseInt(fn1);
    int n2 = Integer.parseInt(fn2);
    int add = n1+n2;
    int sub = n1-n2;
    int multi= n1*n2;
    int div = n1/n2;
    
    out.println("Addtion of two Integer is: "+add);
    out.println("Substraction of two Integer is: "+sub);
    out.println("Multiplition of two Integer is: "+multi);
    
    out.println("Division of two Integer is: "+div);
    
%>