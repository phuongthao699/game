<?php

use Illuminate\Database\Seeder;

class CauHoi extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
       DB::table('cau_hoi')->insert([
       	['noi_dung' =>'']
       	['linh_vuc_id' =>'']
       	['phuong_an_a'=>'']
       	['phuong_an_b'=>'']
       	['phuong_an_c'=>'']
       	['phuong_an_d'=>'']
       	['dap_an'=>'']
       ])
    }
}
