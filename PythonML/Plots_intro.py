# -*- coding: utf-8 -*-
"""
Created on Sat Jul 17 09:17:18 2021

@author: bnpat
"""


# there is a object type fighure that tells us that some information will represented in form of graph
# then we can add subplot to specify the  figure can contain subfigures son basically we specify the number of subfigures
#plt is claa which we call figurwe in create figyure object

import matplotlib.pyplot as plt
import numpy as np



fig=plt.figure() # new figure winodw
ax=fig.add_subplot(1,1,1);

# seeting xlabels and tick

# x axis

ax.set_title("My First Plot",fontsize=14)

#set tick labels x axis

ax.set_xticklabels(np.arange(10),rotation=45,fontsize=10) # seems a basic error here arange and not arrange

#set title for x axis
ax.set_xlabel("x axis");

ax.set_xticks(np.arange(0,10,1.0))

# doing the same for y axis


ax.set_yticklabels(np.arange(10),rotation=45,fontsize=10)
ax.set_ylabel("y-axis")

ax.set_yticks(np.arange(0,10,1.0))


