(defproject org.clojars.vaclavsynacek/gorilla-plantuml "0.1.0-SNAPSHOT"
  :description "PlantUML integration to Gorilla REPL."
  :dependencies
   [[org.clojure/clojure "1.8.0"]
    [gorilla-repl "0.4.0"]
    [net.sourceforge.plantuml/plantuml "2017.08"]]
  :target-path "target/%s"
  :source-paths ["src"]
  :plugins [[lein-gorilla "0.4.0"]]
  :profiles {:uberjar {:aot :all}})
