# -*- coding: utf-8 -*-
"""
Created on Sat Oct 15 10:17:17 2022

@author: shubham pathak
"""

def possibilites(param):
    result = []
    res=""
    generate(result,param,res,0);
    return result;

def generate(result,param,res,index):
    if(len(param)==len(res)):
        result.append(res)
        print(res)
        return
    if(param[index]!='?'):
        generate(result,param,res+param[index],index+1)
    else:
        res1=res
        res2=res
        generate(result,param,res1+'1',index+1)
        generate(result,param,res2+'0',index+1)
    return


    
