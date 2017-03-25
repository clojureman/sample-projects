(ns sample-project-a.core
  (:require [sample-project-x.core :as x]
            [sample-project-y.core :as y]
            [sample-project-z.core :as z]))

(defn -main [& _]
  (println [(-> {:hello :world}
                x/f x/g x/h
                y/f y/g y/h)
            (z/h {})]))

