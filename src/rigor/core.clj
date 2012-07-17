(ns rigor.core
  (:use [rigor.surface])
  (:gen-class))

(defn -main
  "I don't do a whole lot."
  [& args]
  (let [settings {:surface-system :LWJGL}
        surf (create-surface settings)]
    (create surf 600 400)
    (Thread/sleep 5000)
    (destroy surf))
  (println "Hello, World!"))
