(ns rigor.core
  (:use [rigor.surface]
        [rigor.config]
        [rigor.renderer]
        [rigor.scene]
        [rigor.box])
  (:import [rigor.scene Scene])
  (:gen-class))

(defn load-scene [scene objects]
  (Scene. (concat (:objects scene) objects)))

(defn -main
  "I don't do a whole lot."
  [& args]
  (let [settings (parse-ini "test.cfg")
        surf (create-surface settings)
        box (create-box settings)
        scene (atom (Scene. []))]
    (swap! scene load-scene [box])
    (create surf 600 400)
    (render @scene)
    (Thread/sleep 5000)
    (destroy surf))
  (println "Hello, World!"))
