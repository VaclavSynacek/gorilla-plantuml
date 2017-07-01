(ns gorilla-plantuml.core
  (:require [gorilla-renderable.core :as render])
  (:import (java.io FileOutputStream ByteArrayOutputStream)
           (java.nio.charset Charset)
           (net.sourceforge.plantuml SourceStringReader
                                     FileFormat
                                     FileFormatOption)))


(defn generate-svg
  "Takes plantuml text and returns svg of the diagram produced by PlantUML"
  [plantuml-text]
  (let
    [os       (ByteArrayOutputStream.)
     reader   (-> (SourceStringReader. plantuml-text)
                  (.generateImage os (FileFormatOption. FileFormat/SVG)))
     svg      (String. (.toByteArray os) (Charset/forName "UTF-8"))]
    svg))


(defrecord DiagramView [plantuml-text])


(defn diagram-view
  "Function to be called from Gorilla REPL to display PlantUML as UML diagram."
  [plantuml-text]
  (DiagramView. plantuml-text))


(extend-type DiagramView
  render/Renderable
  (render [self]
    {:type :html :content (generate-svg (:plantuml-text self)) :value (:plantuml-text self)}))
