;; gorilla-repl.fileformat = 1

;; **
;;; # Prototyping UML with Gorilla REPL and PlantUML
;;; 
;;; Require [gorilla-plantuml.core], call diagram-view and enjoy the insights.
;; **

;; @@
(ns star-wars-uml-example
  (:require [gorilla-plantuml.core :as uml]))

(def star-wars "
@startuml
Vader -> Luke: I'm your father.
Luke --> Vader: No. No. Nooo! It's not true. That's impossible.  
Vader -> Luke: Search your feelings.
@enduml
")

(uml/diagram-view star-wars)
;; @@
;; =>
;;; {"type":"html","content":"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" contentScriptType=\"application/ecmascript\" contentStyleType=\"text/css\" height=\"183px\" preserveAspectRatio=\"none\" style=\"width:381px;height:183px;\" version=\"1.1\" viewBox=\"0 0 381 183\" width=\"381px\" zoomAndPan=\"magnify\"><defs><filter height=\"300%\" id=\"fh5ouag\" width=\"300%\" x=\"-1\" y=\"-1\"><feGaussianBlur result=\"blurOut\" stdDeviation=\"2.0\"/><feColorMatrix in=\"blurOut\" result=\"blurOut2\" type=\"matrix\" values=\"0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 .4 0\"/><feOffset dx=\"4.0\" dy=\"4.0\" in=\"blurOut2\" result=\"blurOut3\"/><feBlend in=\"SourceGraphic\" in2=\"blurOut3\" mode=\"normal\"/></filter></defs><g><line style=\"stroke: #A80036; stroke-width: 1.0; stroke-dasharray: 5.0,5.0;\" x1=\"37\" x2=\"37\" y1=\"38.2969\" y2=\"145.6953\"/><line style=\"stroke: #A80036; stroke-width: 1.0; stroke-dasharray: 5.0,5.0;\" x1=\"350.5\" x2=\"350.5\" y1=\"38.2969\" y2=\"145.6953\"/><rect fill=\"#FEFECE\" filter=\"url(#fh5ouag)\" height=\"30.2969\" style=\"stroke: #A80036; stroke-width: 1.5;\" width=\"54\" x=\"8\" y=\"3\"/><text fill=\"#000000\" font-family=\"sans-serif\" font-size=\"14\" lengthAdjust=\"spacingAndGlyphs\" textLength=\"40\" x=\"15\" y=\"22.9951\">Vader</text><rect fill=\"#FEFECE\" filter=\"url(#fh5ouag)\" height=\"30.2969\" style=\"stroke: #A80036; stroke-width: 1.5;\" width=\"54\" x=\"8\" y=\"144.6953\"/><text fill=\"#000000\" font-family=\"sans-serif\" font-size=\"14\" lengthAdjust=\"spacingAndGlyphs\" textLength=\"40\" x=\"15\" y=\"164.6904\">Vader</text><rect fill=\"#FEFECE\" filter=\"url(#fh5ouag)\" height=\"30.2969\" style=\"stroke: #A80036; stroke-width: 1.5;\" width=\"47\" x=\"325.5\" y=\"3\"/><text fill=\"#000000\" font-family=\"sans-serif\" font-size=\"14\" lengthAdjust=\"spacingAndGlyphs\" textLength=\"33\" x=\"332.5\" y=\"22.9951\">Luke</text><rect fill=\"#FEFECE\" filter=\"url(#fh5ouag)\" height=\"30.2969\" style=\"stroke: #A80036; stroke-width: 1.5;\" width=\"47\" x=\"325.5\" y=\"144.6953\"/><text fill=\"#000000\" font-family=\"sans-serif\" font-size=\"14\" lengthAdjust=\"spacingAndGlyphs\" textLength=\"33\" x=\"332.5\" y=\"164.6904\">Luke</text><polygon fill=\"#A80036\" points=\"339,65.2969,349,69.2969,339,73.2969,343,69.2969\" style=\"stroke: #A80036; stroke-width: 1.0;\"/><line style=\"stroke: #A80036; stroke-width: 1.0;\" x1=\"37\" x2=\"345\" y1=\"69.2969\" y2=\"69.2969\"/><text fill=\"#000000\" font-family=\"sans-serif\" font-size=\"13\" lengthAdjust=\"spacingAndGlyphs\" textLength=\"97\" x=\"44\" y=\"64.3638\">I'm your father.</text><polygon fill=\"#A80036\" points=\"48,94.4297,38,98.4297,48,102.4297,44,98.4297\" style=\"stroke: #A80036; stroke-width: 1.0;\"/><line style=\"stroke: #A80036; stroke-width: 1.0; stroke-dasharray: 2.0,2.0;\" x1=\"42\" x2=\"350\" y1=\"98.4297\" y2=\"98.4297\"/><text fill=\"#000000\" font-family=\"sans-serif\" font-size=\"13\" lengthAdjust=\"spacingAndGlyphs\" textLength=\"290\" x=\"54\" y=\"93.4966\">No. No. Nooo! It's not true. That's impossible.</text><polygon fill=\"#A80036\" points=\"339,123.5625,349,127.5625,339,131.5625,343,127.5625\" style=\"stroke: #A80036; stroke-width: 1.0;\"/><line style=\"stroke: #A80036; stroke-width: 1.0;\" x1=\"37\" x2=\"345\" y1=\"127.5625\" y2=\"127.5625\"/><text fill=\"#000000\" font-family=\"sans-serif\" font-size=\"13\" lengthAdjust=\"spacingAndGlyphs\" textLength=\"134\" x=\"44\" y=\"122.6294\">Search your feelings.</text></g></svg>","value":"\n@startuml\nVader -> Luke: I'm your father.\nLuke --> Vader: No. No. Nooo! It's not true. That's impossible.  \nVader -> Luke: Search your feelings.\n@enduml\n"}
;; <=

;; @@

;; @@
