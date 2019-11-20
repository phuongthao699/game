<?php

namespace App\Http\Controllers\API;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Cau_Hoi;
class CauHoiController extends Controller
{
    public function layCauHoi()
    {
    	$listCauHoi = Cau_Hoi::all()->random(4);
    	$result = [
    		'success' => true,
    		'data'	  => $listCauHoi
    	];

    	return response()->json($result);
    }
}
