# -*- coding: utf-8 -*-
"""
Created on Sun Jul 25 09:55:36 2021

@author: bnpat
"""
#Is there any correlation between
# wind direction and speed with the 
#average temperature?

import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from matplotlib.colors import LinearSegmentedColormap
import matplotlib.patches as mpatches
from matplotlib.collections import PatchCollection


#C:\Users\bnpat\OneDrive\Documents\game-off\PythonML\DataSets\wind_direction.csv

#C:\Users\bnpat\OneDrive\Documents\game-off\PythonML\DataSets\wind_speed.csv

#C:\Users\bnpat\OneDrive\Documents\game-off\PythonML\DataSets\temperature.csv
 
wind_direction=pd.read_csv(r"C:\Users\bnpat\OneDrive\Documents\game-off\PythonML\DataSets\wind_direction.csv")

wind_speed=pd.read_csv(r"C:\Users\bnpat\OneDrive\Documents\game-off\PythonML\DataSets\wind_speed.csv")

temperature=pd.read_csv(r"C:\Users\bnpat\OneDrive\Documents\game-off\PythonML\DataSets\temperature.csv")


#filter out the data select city and drop out NaN values is NULL


# select toronto

city='Toronto'

wind_direction_list=list(wind_direction[city].dropna())

wind_speed_list=list(wind_speed[city].dropna());

temperature_list=list(wind_speed[city].dropna());



# combine them into single data frome polar coorinfinates


r=[];   #// wind speed
theta=[]; # //wind direction
temp=[]; # //temperature


for i,w in enumerate(wind_direction_list):
    r.append(wind_speed_list[i])
    theta.append(wind_direction_list[i])
    temp.append(temperature_list[i]);

df=pd.DataFrame(list(zip(r,theta,temp)),columns=['r','theta','temp'])



ntheta = 30; dtheta = 360/ntheta;
nradius = 20; dradius = max(r)/nradius;


#set desired color for visulaiztion
# look https://coolors.co/

colors = ['#000052','#0c44ac','#faf0ca','#ed0101','#970005'] 

cm = LinearSegmentedColormap.from_list('custom', colors,N=10)
cm.set_bad(color='white')





patches = []; avg_temp = []

for nr in range(nradius,0,-1):  # See!  Outside to Inside
    start_r = (nr-1)*dradius
    end_r = (nr)*dradius
    for nt in range(0,ntheta):
        start_t = nt*dtheta
        end_t = (nt+1)*dtheta
    
        stripped = df[(df['r']>=start_r) & (df['r']<end_r) &          
            (df['theta']>=start_t) & (df['theta']<end_t)]
       
        avg_temp.append(stripped['temp'].mean())
        wedge = mpatches.Wedge(0,end_r, start_t, end_t)
        patches.append(wedge)
        
        
        
collection = PatchCollection(patches,linewidth=0.0,
    edgecolor=['#000000' for x in avg_temp], 
    facecolor=cm([(x-263.15 )/(303.15 -263.15 ) for x in avg_temp]))        
        


fig = plt.figure(figsize=(40,20), dpi=200,
    edgecolor='w',facecolor='w')
 
ax = fig.add_subplot()

ax.add_collection(collection)



plt.axis('equal')
plt.axis('off')
plt.tight_layout()

plt.savefig('toronto.png')
plt.show()
