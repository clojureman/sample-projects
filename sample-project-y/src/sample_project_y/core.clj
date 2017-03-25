(ns sample-project-y.core
  (:require [sample-project-z.core :as z]))

(defn f [m] (assoc m :y/f 1))
(defn g [m] (assoc m :y/g 1))
(defn h [m] (assoc (z/h m) :y/h 1))
