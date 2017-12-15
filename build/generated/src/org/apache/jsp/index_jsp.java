package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Lunar Lander</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"Minijuego Lunar Lander con html, css, y JavaScript\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel='stylesheet' media='screen and (min-width: 601px)' href='css/responsive.css'>\n");
      out.write("        <link rel='stylesheet' media='screen and (max-width: 600px)' href='css/smartphone.css'>\n");
      out.write("        <script src=\"js/js.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"contenedor\">\n");
      out.write("\n");
      out.write("        <div id=\"nave\">\n");
      out.write("            <img id =\"imgNave\" src=\"img/nave.png\" alt=\"img nave\">\n");
      out.write("            <img id =\"imgMotor\" src=\"img/motor.gif\" alt=\"img motor\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"izquierda\">\n");
      out.write("            <div id=\"cpanel\">\n");
      out.write("                <div class=\"controlesNave\">Velocidad:<br><b><span id=\"velocidad\">100</span></b> m/s</div>\n");
      out.write("                <div class=\"controlesNave\">Fuel:<br><b><span id=\"fuel\">100</span></b> %</div>\n");
      out.write("                <div class=\"controlesNave\">Altura:<br><b><span id=\"altura\">60</span></b> m</div>\n");
      out.write("                <div id=\"botonOn\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"zonaAterrizaje\"><img src=\"img/luna.png\" alt=\"luna\" id=\"luna\"></div>\n");
      out.write("\n");
      out.write("        <div id=\"derechaSmartphone\">\n");
      out.write("            <div id=\"reanudaSmartphone\"><p>Play</p></div>\n");
      out.write("            <div id=\"pausaSmartphone\">MenÃº</div>\n");
      out.write("            <div id=\"reiniciaSmartphone\"><p>Reiniciar</p></div>\n");
      out.write("            <div id=\"ayudaSmartphone\"><p>Ayuda</p></div>\n");
      out.write("            <div id=\"botonAjustesSmartphone\"><p>Ajustes</p></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"derecha\">\n");
      out.write("            <div id=\"reanudar\"><p>Play</p></div>\n");
      out.write("            <div id=\"pausa\">Pausar</div>\n");
      out.write("            <div id=\"reinicia\"><p>Reiniciar</p></div>\n");
      out.write("            <div id=\"instrucciones\"><p>Ayuda</p></div>\n");
      out.write("            <div id=\"botonAjustes\"><p>Ajustes</p></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"gameOver\">\n");
      out.write("            <h2>Â¡Â¡Â¡GAME OVER!!!</h2>\n");
      out.write("            Â¡IntÃ©ntalo de nuevo! <br>\n");
      out.write("            La velocidad de la nave no debe superar los 5 metros/segundo<br><br>\n");
      out.write("            <button id=\"jugarOtraVez\"><h3>Probar otra vez</h3></button>\n");
      out.write("            <button id=\"jugarOtraVezSmartphone\"><h3>Probar otra vez</h3></button>\n");
      out.write("            <br><br>\n");
      out.write("            Intentos realizados: <b><span id=\"intentos\">0</span></b><br><br>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"userWin\">\n");
      out.write("            <h2>Â¡Â¡Â¡ENHORABUENA!!!</h2>\n");
      out.write("            La NASA estarÃ­a orgullosa de contar con pilotos como tÃº...<br><br>\n");
      out.write("            <img src=\"img/Enhorabuena.gif\"><br>\n");
      out.write("            <button id=\"jugarAgain\"><h3>Jugar otra vez</h3></button>\n");
      out.write("            <button id=\"jugarAgainSmartphone\"><h3>Jugar otra vez</h3></button><br><br>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"menuInstrucciones\">\n");
      out.write("            <a href=\"#\" onclick=\"ocultarInstrucciones();\"><img id=\"close\" src=\"img/close.png\" alt=\"close\"></a>\n");
      out.write("            <h3>INSTRUCCIONES</h3>\n");
      out.write("            <p>El juego consiste en frenar la caÃ­da de la nave mediante el uso del motor, utiliza la tecla <b>&nbsp;&nbsp;espacio&nbsp;&nbsp;</b> o el botÃ³n <b>ON</b> para la version smartphone, para que esta pueda aterrizar adecuadamente sobre la superficie lunar.<br><br>Si el jugador no frena lo suficientemente la caÃ­da de la nave ,a una <b>velocidad inferior a los 5 m/s</b>, esta se estrellarÃ¡ y el jugador no superarÃ¡ el juego.<br><br> AdemÃ¡s hay que tener en cuenta que la nave cuenta con un medidor de gasolina que se acabarÃ¡ si el jugador abusa del uso del motor de la nave.</p>\n");
      out.write("            <a href=\"acerca.html\"><button><h3>Acerca de...</h3></button></a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"settings\">\n");
      out.write("            <a href=\"#\" onclick=\"ocultarAjustes();\"><img id=\"close\" src=\"img/close.png\" alt=\"close\"></a>\n");
      out.write("            <h3>AJUSTES</h3>\n");
      out.write("            <p>Dificultad del juego:<br>\n");
      out.write("                (Disminuye el depÃ³sito de gasolina)<br>\n");
      out.write("                <button id=\"dificultad\">FÃ¡cil</button><br><br>\n");
      out.write("                Modelo luna:<br>\n");
      out.write("                <button id=\"modeloLuna\">Amarilla</button>\n");
      out.write("            </p>\n");
      out.write("            Modelo nave:<br>\n");
      out.write("            <button id=\"modeloNave\">Modelo EstÃ¡ndar</button><br><br>\n");
      out.write("\n");
      out.write("            </body>\n");
      out.write("            </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
