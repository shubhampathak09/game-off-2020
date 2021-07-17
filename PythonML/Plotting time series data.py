# -*- coding: utf-8 -*-
"""
Created on Sat Jul 17 09:37:27 2021

@author: bnpat
"""


#plotting the time series data

import matplotlib
import matplotlib.pyplot as plt

import datetime

dates=[datetime.date( 2001,6,1),datetime.date( 2001,6,2),datetime.date( 2001,6,3),
       datetime.date( 2001,6,4),datetime.date( 2001,6,5),datetime.date( 2001,6,6),
        datetime.date( 2001,6,7), datetime.date( 2001,6,8), datetime.date( 2001,6,9),
         datetime.date( 2001,6,10)]
       

nao_index = [ 0.132, -0.058, -0.321, -0.395, -0.216, -0.082, -0.023, -0.012, -0.012, -0.02]


fig=plt.figure()
ax=fig.add_subplot(1,1,1)

ax.set_title("Time Series data")

ax.set_xticks(dates)

ax.set_xticklabels(dates,rotation=45,fontsize=14)
ax.set_xlabel("Dates(yyyy-mm-dd")

ax.set_ylabel("nao_index")
 

#set MAzjor formatore and DateFormatter


ax.xaxis.set_major_formatter(matplotlib.dates.DateFormatter('%a %d %b %Y'))

ax.plot(dates,nao_index)

# to do basenap plotting raster and vector data and many other topics

# this was a gentle intro to plots and lib function such as fig and subplot see only at scracth
