<?php

namespace App\Http\Controllers\API;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\NguoiChoi
class NguoiChoiController extends Controller
{
    public function layNguoiChoi()
    {
    	$list = NguoiChoi::all()->random(4);
    	$result = [
    		'success' => true,
    		'data'	  => $listNguoiChoi
    	];

    	return response()->json($result);
    }
}
