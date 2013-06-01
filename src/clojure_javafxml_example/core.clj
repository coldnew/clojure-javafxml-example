(ns clojure-javafxml-example.core
  (:import (javafx.application Application)
           (javafx.fxml FXMLLoader)
           (javafx.scene Scene)
           (javafx.stage Stage)))

(gen-class
 :name clojure-javafxml-example.core
 :extends javafx.application.Application)

(defn -main [& args]
  (Application/launch clojure-javafxml-example.core args))

(defn -start [this stage]
  (let [loc (clojure.java.io/resource "window.fxml")
        root (FXMLLoader/load loc)]

    (.setScene stage (Scene. root))
    (.setTitle stage "JavaFXML with Clojure Example")
    (.show stage)))
