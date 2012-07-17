(ns rigor.scene
  (:use [rigor.renderer]))

(defrecord Scene [objects]
  Renderable
  (render [this]
    (doseq [obj objects] (render obj))))
