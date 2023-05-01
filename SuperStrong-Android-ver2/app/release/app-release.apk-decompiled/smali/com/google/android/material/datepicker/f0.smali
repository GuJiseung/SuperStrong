.class public final Lcom/google/android/material/datepicker/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lcom/google/android/material/datepicker/g0;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/g0;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/f0;->c:Lcom/google/android/material/datepicker/g0;

    iput p2, p0, Lcom/google/android/material/datepicker/f0;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lcom/google/android/material/datepicker/f0;->c:Lcom/google/android/material/datepicker/g0;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/google/android/material/datepicker/g0;->c:Lcom/google/android/material/datepicker/i;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/material/datepicker/i;->a0:Lcom/google/android/material/datepicker/v;

    .line 6
    .line 7
    iget v0, v0, Lcom/google/android/material/datepicker/v;->c:I

    .line 8
    .line 9
    iget v1, p0, Lcom/google/android/material/datepicker/f0;->b:I

    .line 10
    .line 11
    invoke-static {v1, v0}, Lcom/google/android/material/datepicker/v;->k(II)Lcom/google/android/material/datepicker/v;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object p1, p1, Lcom/google/android/material/datepicker/g0;->c:Lcom/google/android/material/datepicker/i;

    .line 16
    .line 17
    iget-object v1, p1, Lcom/google/android/material/datepicker/i;->Y:Lcom/google/android/material/datepicker/a;

    .line 18
    .line 19
    iget-object v2, v1, Lcom/google/android/material/datepicker/a;->b:Lcom/google/android/material/datepicker/v;

    .line 20
    .line 21
    iget-object v3, v2, Lcom/google/android/material/datepicker/v;->b:Ljava/util/Calendar;

    .line 22
    .line 23
    iget-object v4, v0, Lcom/google/android/material/datepicker/v;->b:Ljava/util/Calendar;

    .line 24
    .line 25
    invoke-virtual {v4, v3}, Ljava/util/Calendar;->compareTo(Ljava/util/Calendar;)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-gez v3, :cond_0

    .line 30
    .line 31
    move-object v0, v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v1, v1, Lcom/google/android/material/datepicker/a;->c:Lcom/google/android/material/datepicker/v;

    .line 34
    .line 35
    iget-object v2, v1, Lcom/google/android/material/datepicker/v;->b:Ljava/util/Calendar;

    .line 36
    .line 37
    invoke-virtual {v4, v2}, Ljava/util/Calendar;->compareTo(Ljava/util/Calendar;)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-lez v2, :cond_1

    .line 42
    .line 43
    move-object v0, v1

    .line 44
    :cond_1
    :goto_0
    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/i;->R(Lcom/google/android/material/datepicker/v;)V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/i;->S(I)V

    .line 49
    .line 50
    .line 51
    return-void
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method
