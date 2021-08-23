#!/usr/bin/env python
# coding: utf-8

# In[17]:


import cv2
import numpy as np


# In[18]:


img = cv2.imread(r'C:\Users\Tanya srivastava\Downloads\roti-2.jpg',1)
cv2.imshow("Hello",img)
cv2.waitKey()
cv2.destroyAllWindows()


# In[19]:


R,B,G = img[0,12]
print(R,B,G)


# In[20]:


gray_img = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
cv2.imshow("Gray Hello",gray_img)
cv2.waitKey()
cv2.destroyAllWindows()


# In[21]:


gray_img[0,0]


# In[26]:


hsv_img = cv2.cvtColor(img, cv2.COLOR_BGR2HSV)
cv2.imshow("Value channel", hsv_img[:,:,2])
cv2.waitKey()
cv2.destroyAllWindows()


# In[33]:


R,B,G = cv2.split(img)
zeros = np.zeros(img.shape[:2],dtype = "uint8")
cv2.imshow("Red", cv2.merge([zeros,zeros,R]))
cv2.waitKey()
cv2.destroyAllWindows()


# In[36]:


from matplotlib import pyplot as plt


# In[45]:


histogram  = cv2.calcHist([img],[2],None,[256],[0,256])
plt.hist(img.ravel(),256,[0,256]);
plt.show();
color = ('b','g','r')
for i,col in enumerate(color):
    histogram2 = cv2.calcHist([img],[i],None,[256],[0,256])
    plt.plot(histogram2, color = col)
    plt.xlim([0,256])
    plt.show()


# In[ ]:





# In[ ]:





# In[ ]:




