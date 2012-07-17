(ns rigor.config
  (:use [clojure.string :only [split split-lines]])
  (:gen-class))

(defn parse-ini [cfg_file]
  "Parse an ini config file, returning a map of settings"
  (let [cfg_map (into {}
                  (map #(split % #"=")
                    (split-lines (slurp cfg_file))))]
    (zipmap (map #(keyword %) (keys cfg_map)) (vals cfg_map))))
