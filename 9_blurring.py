import cv2
import numpy as np

image = cv2.imread('pic.jpg')
cv2.imshow('Original Image', image)
# cv2.waitKey(0)

# #Creating out 3 x 3 kernel
# kernal_3x3 = np.ones((3, 3), np.float32)/9
# blurred = cv2.filter2D(image, -1, kernal_3x3)
# cv2.imshow('3 x 3 Kernel blurred', blurred)
# # cv2.waitKey(0)

# #kcreating 7 x 7 krrnel
# kernal_7x7 = np.ones((7, 7), np.float32)/49
# blurred = cv2.filter2D(image, -1, kernal_7x7)
# cv2.imshow('7 x 7 Kernel blurred', blurred)
# cv2.waitKey(0)
# cv2.destroyAllWindows()

# # 2.
# blur = cv2.blur(image, (3,3))
# cv2.imshow('Averaging', blur)
# # cv2.waitKey(0)

# # Instead of box filter, gaussian kernel
# Gaussian = cv2.GaussianBlur(image, (7,7), 0)
# cv2.imshow('Gaussian Blurring', Gaussian)
# cv2.waitKey(0)

# # Takes median of all the pixels under kernel area and central 
# # element is replaced with this median value
# median = cv2.medianBlur(image, 5)
# cv2.imshow('Median Blurring', median)
 
3.
 # Bilateral is very effective in noise removal while keeping edges sharp
bilateral = cv2.bilateralFilter(image, 9, 75, 75)
cv2.imshow('Bilateral Blurring', bilateral)
cv2.waitKey(0)
cv2.destroyAllWindows()