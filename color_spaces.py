import cv2
import numpy as np
image = cv2.imread('aa.jpg')

#1.BGR value for the first (0, 0) pixel (2D image)
# B, G, R =   image[0, 0]
# print(B, G, R) #black green blue color value in first pix el
# print(image.shape)

# bw = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
# print(bw.shape)

# 2.HSV
# image2 = cv2.imread('pic.jpg')
# hsv_image = cv2.imread(image2, cv2.COLOR_BGR2HSV)
# cv2.imshow('HSV image', hsv_image)
# cv2.imshow('hue channel', hsv_image[:, :, 0])
# cv2.imshow('saturation channel', hsv_image[:, :, 1])
# cv2.imshow('value channel', hsv_image[:, :, -1])
# cv2.waitKey(0)
# cv2.destroyAllWindows()

# 3. 'split' - splites the image into each color index
B, G, R = cv2.split(image)
cv2.imshow("Red", R)
cv2.imshow("Green", G)
cv2.imshow("Blue", B)
cv2.waitKey(0)
cv2.destroyAllWindows()
#remake the original image
merged = cv2.merge([B, G, R])
cv2.imshow("Merge", merged)
merged = cv2.merge([B, G, R+100])
cv2.imshow("Merge with rad amplufy", merged)
cv2.waitKey(0)


