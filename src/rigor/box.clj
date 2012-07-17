(ns rigor.box
  (:use [rigor.renderer]
        [rigor.animation])
  (:import [org.lwjgl.opengl GL11 GL20 GL21]))

(defmulti create-box :renderer)

(defrecord GL20Box [position program]
  Renderable
  (render [this]
    (println "Rendering a box"))
  Movable
  (translate [this direction amount]
    (println "Moving a box")))

(defmethod create-box "gl20" [settings]
  (GL20Box. "pos" "prog"))
