<?php

namespace App;

use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\SoftDeletes;
class Cau_Hoi extends Model
{
    use SoftDeletes;
    protected $table = 'cau_hoi';
}
