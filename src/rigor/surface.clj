(ns rigor.surface
  (:import [org.lwjgl.opengl Display DisplayMode])
  (:gen-class))

(defprotocol Surface
  (create [this width height])
  (destroy [this])
  (resize [this width height])
  (set-fullscreen [this fs])
  (fullscreen? [this]))

(defmulti create-surface :surface-system)

(defrecord LWJGLSurface []
  Surface
  (create [this width height]
    (Display/setDisplayMode (DisplayMode. width height))
    (Display/create))
  (destroy [this]
    (Display/destroy))
  (resize [this width height]
    (println "TODO: implement Surface/display"))
  (set-fullscreen [this fs]
    (Display/setFullscreen fs))
  (fullscreen? [this]
    (Display/isFullscreen)))

(defmethod create-surface "lwjgl" [settings]
  (LWJGLSurface.))


