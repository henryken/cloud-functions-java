package com.henrysuryawirawan.demo.cloudfunctions.helloworld;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld {

  public void helloWorld(HttpServletRequest request, HttpServletResponse response)
      throws IOException {

    String name = request.getParameter("name");
    if (name == null) {
      name = "World";
    }

    PrintWriter writer = response.getWriter();
    writer.write("Hello " + name + "!");
  }

}
