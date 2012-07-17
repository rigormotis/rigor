(ns rigor.core
  (:use [rigor.surface]
        [rigor.config])
  (:gen-class))

(defn -main
  "I don't do a whole lot."
  [& args]
  (let [settings (parse-ini "test.cfg")
        surf (create-surface settings)]
    (create surf 600 400)
    (Thread/sleep 5000)
    (destroy surf))
  (println "Hello, World!"))
